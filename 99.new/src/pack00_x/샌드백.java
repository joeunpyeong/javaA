package pack00_x;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ����� {
    private int size; // ���� ������ ũ��
    private List<List<Character>> board; // ���� ���带 ��Ÿ���� 2���� ����Ʈ
    private int playerRow; // �÷��̾��� ���� ��ġ (��)
    private int playerCol; // �÷��̾��� ���� ��ġ (��)

    public �����(int size) {
        this.size = size;
        this.board = new ArrayList<>();

        // ���� ���� �ʱ�ȭ
        for (int i = 0; i < size; i++) {
            List<Character> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                row.add('.'); // �� ������ '.'���� ǥ��
            }
            board.add(row);
        }

        // �÷��̾� �ʱ� ��ġ ����
        this.playerRow = size / 2;
        this.playerCol = size / 2;
        board.get(playerRow).set(playerCol, 'P'); // �÷��̾ 'P'�� ǥ��
    }

    // ���� ���� ���
    public void printBoard() {
        for (List<Character> row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // �÷��̾� �̵�
    public void movePlayer(String direction) {
        // �̵��� ��ġ ���
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

        // �̵� �������� Ȯ��
        if (isValidMove(newRow, newCol)) {
            // ���� ��ġ�� '.'���� ������Ʈ
            board.get(playerRow).set(playerCol, '.');

            // ���ο� ��ġ�� �÷��̾� �̵�
            playerRow = newRow;
            playerCol = newCol;
            board.get(playerRow).set(playerCol, 'P');
        } else {
            System.out.println("�߸��� �̵��Դϴ�.");
        }
    }

    // �̵� �������� Ȯ��
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("���� ������ ũ�⸦ �Է��ϼ���: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        ����� gameBoard = new �����(size);

        while (true) {
            System.out.println("���� ���� ���� ����:");
            gameBoard.printBoard();

            System.out.print("�̵��� ������ �Է��ϼ��� (up/down/left/right): ");
            String direction = scanner.nextLine();

            gameBoard.movePlayer(direction);
        }
    }
}
