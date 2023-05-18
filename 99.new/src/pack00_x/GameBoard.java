package pack00_x;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class GameBoard extends JPanel implements KeyListener {
    private static final int CELL_SIZE = 20; // 셀의 크기
    private static final int BOARD_WIDTH = 10; // 보드의 너비 (셀 개수)
    private static final int BOARD_HEIGHT = 20; // 보드의 높이 (셀 개수)
    private List<List<Color>> board; // 게임 보드 (리스트 배열)

    private int currentX; // 현재 블록의 X 좌표
    private int currentY; // 현재 블록의 Y 좌표

    public GameBoard() {
        setPreferredSize(new Dimension(CELL_SIZE * BOARD_WIDTH, CELL_SIZE * BOARD_HEIGHT));
        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(this);

        // 게임 보드 초기화
        initializeBoard();

        // 게임 루프 시작
        startGameLoop();
    }

    private void initializeBoard() {
        // 게임 보드 생성 및 초기화
        board = new ArrayList<>();
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            List<Color> row = new ArrayList<>();
            for (int j = 0; j < BOARD_WIDTH; j++) {
                row.add(Color.BLACK); // 빈 셀은 검은색으로 초기화
            }
            board.add(row);
        }

        // 초기 블록 위치 설정
        currentX = BOARD_WIDTH / 2;
        currentY = 0;
        // 현재 블록을 빨간색으로 표시
        board.get(currentY).set(currentX, Color.RED);
    }

    private void startGameLoop() {
        // 게임 루프
        while (true) {
            // 보드를 다시 그림
            repaint();

            // 일정 시간 동안 대기
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 블록을 한 칸 아래로 이동
            moveDown();
        }
    }

    private void moveDown() {
        // 현재 위치에서 블록을 제거
        board.get(currentY).set(currentX, Color.BLACK);

        // Y 좌표를 아래로 이동
        currentY++;

        // 이동한 위치에 블록을 그림
        board.get(currentY).set(currentX, Color.RED);
    }

    private void moveLeft() {
        // 현재 위치에서 블록을 제거
        board.get(currentY).set(currentX, Color.BLACK);

        // X 좌표를 왼쪽으로 이동
        currentX--;

        // 이동한 위치에 블록을 그림
        board.get(currentY).set(currentX, Color.RED);
    }

    private void moveRight() {
        // 현재 위치에서 블록을 제거
        board.get(currentY).set(currentX, Color.BLACK);

        // X 좌표를 오른쪽으로 이동
        currentX++;

        // 이동한 위치에 블록을 그림
        board.get(currentY).set(currentX, Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 게임 보드 그리기
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                Color color = board.get(i).get(j);
                g.setColor(color);
                g.fillRect(j * CELL_SIZE, i * CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
            // 위쪽 화살표 키 눌렸을 때 동작
        } else if (keyCode == KeyEvent.VK_DOWN) {
            // 아래쪽 화살표 키 눌렸을 때 동작
            moveDown();
        } else if (keyCode == KeyEvent.VK_LEFT) {
            // 왼쪽 화살표 키 눌렸을 때 동작
            moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            // 오른쪽 화살표 키 눌렸을 때 동작
            moveRight();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Game Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GameBoard());
        frame.pack();
        frame.setVisible(true);
    }
}
