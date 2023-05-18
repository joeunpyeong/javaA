package pack00_x;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 샌드백 {
    private int size; // 게임 보드의 크기
    private List<List<Character>> board; // 게임 보드를 나타내는 2차원 리스트
    private int playerRow; // 플레이어의 현재 위치 (행)
    private int playerCol; // 플레이어의 현재 위치 (열)

    public 샌드백(int size) {
        this.size = size;
        this.board = new ArrayList<>();

        // 게임 보드 초기화
        for (int i = 0; i < size; i++) {
            List<Character> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add('.'); // 빈 공간을 '.'으로 표시
            }
            board.add(row);
        }

        // 플레이어 초기 위치 설정
        this.playerRow = size / 2;
        this.playerCol = size / 2;
        board.get(playerRow).set(playerCol, 'P'); // 플레이어를 'P'로 표시
    }

    // 게임 보드 출력
    public void printBoard() {
        for (List<Character> row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // 플레이어 이동
    public void movePlayer(String direction) {
        // 이동할 위치 계산
        int newRow = playerRow;
        int newCol = playerCol;

        if (direction.equals("up")) {
            newRow--;
        } else if (direction.equals("down")) {
            newRow++;
        } else if (direction.equals("left")) {
            newCol--;
        } else if (direction.equals("right")) {
            newCol++;
        }

        // 이동 가능한지 확인
        if (isValidMove(newRow, newCol)) {
            // 이전 위치를 '.'으로 업데이트
            board.get(playerRow).set(playerCol, '.');

            // 새로운 위치로 플레이어 이동
            playerRow = newRow;
            playerCol = newCol;
            board.get(playerRow).set(playerCol, 'P');
        } else {
            System.out.println("잘못된 이동입니다.");
        }
    }

    // 이동 가능한지 확인
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("게임 보드의 크기를 입력하세요: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        샌드백 gameBoard = new 샌드백(size);

        while (true) {
            System.out.println("현재 게임 보드 상태:");
            gameBoard.printBoard();

            System.out.print("이동할 방향을 입력하세요 (up/down/left/right): ");
            String direction = scanner.nextLine();

            gameBoard.movePlayer(direction);
        }
    }
}
