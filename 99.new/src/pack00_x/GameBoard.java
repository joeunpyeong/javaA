package pack00_x;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class GameBoard extends JPanel implements KeyListener {
    private static final int CELL_SIZE = 20; // ���� ũ��
    private static final int BOARD_WIDTH = 10; // ������ �ʺ� (�� ����)
    private static final int BOARD_HEIGHT = 20; // ������ ���� (�� ����)
    private List<List<Color>> board; // ���� ���� (����Ʈ �迭)

    private int currentX; // ���� ����� X ��ǥ
    private int currentY; // ���� ����� Y ��ǥ

    public GameBoard() {
        setPreferredSize(new Dimension(CELL_SIZE * BOARD_WIDTH, CELL_SIZE * BOARD_HEIGHT));
        setBackground(Color.WHITE);
        setFocusable(true);
        addKeyListener(this);

        // ���� ���� �ʱ�ȭ
        initializeBoard();

        // ���� ���� ����
        startGameLoop();
    }

    private void initializeBoard() {
        // ���� ���� ���� �� �ʱ�ȭ
        board = new ArrayList<>();
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            List<Color> row = new ArrayList<>();
            for (int j = 0; j < BOARD_WIDTH; j++) {
                row.add(Color.BLACK); // �� ���� ���������� �ʱ�ȭ
            }
            board.add(row);
        }

        // �ʱ� ��� ��ġ ����
        currentX = BOARD_WIDTH / 2;
        currentY = 0;
        // ���� ����� ���������� ǥ��
        board.get(currentY).set(currentX, Color.RED);
    }

    private void startGameLoop() {
        // ���� ����
        while (true) {
            // ���带 �ٽ� �׸�
            repaint();

            // ���� �ð� ���� ���
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // ����� �� ĭ �Ʒ��� �̵�
            moveDown();
        }
    }

    private void moveDown() {
        // ���� ��ġ���� ����� ����
        board.get(currentY).set(currentX, Color.BLACK);

        // Y ��ǥ�� �Ʒ��� �̵�
        currentY++;

        // �̵��� ��ġ�� ����� �׸�
        board.get(currentY).set(currentX, Color.RED);
    }

    private void moveLeft() {
        // ���� ��ġ���� ����� ����
        board.get(currentY).set(currentX, Color.BLACK);

        // X ��ǥ�� �������� �̵�
        currentX--;

        // �̵��� ��ġ�� ����� �׸�
        board.get(currentY).set(currentX, Color.RED);
    }

    private void moveRight() {
        // ���� ��ġ���� ����� ����
        board.get(currentY).set(currentX, Color.BLACK);

        // X ��ǥ�� ���������� �̵�
        currentX++;

        // �̵��� ��ġ�� ����� �׸�
        board.get(currentY).set(currentX, Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // ���� ���� �׸���
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
            // ���� ȭ��ǥ Ű ������ �� ����
        } else if (keyCode == KeyEvent.VK_DOWN) {
            // �Ʒ��� ȭ��ǥ Ű ������ �� ����
            moveDown();
        } else if (keyCode == KeyEvent.VK_LEFT) {
            // ���� ȭ��ǥ Ű ������ �� ����
            moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            // ������ ȭ��ǥ Ű ������ �� ����
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
