import javax.swing.*;
import java.awt.*;

public class UpsideDownRobotFace extends JPanel {

    // Constants for dimensions
    private static final int HEAD_WIDTH = 150;
    private static final int HEAD_HEIGHT = 200;
    private static final int EYE_RADIUS = 20;
    private static final int MOUTH_WIDTH = 60;
    private static final int MOUTH_HEIGHT = 20;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Centering coordinates
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Head coordinates
        int headX = centerX - HEAD_WIDTH / 2;
        int headY = centerY - HEAD_HEIGHT / 2;

        // Draw head
        g.setColor(Color.GRAY);
        g.fillRect(headX, headY, HEAD_WIDTH, HEAD_HEIGHT);
        g.setColor(Color.BLACK);
        g.drawRect(headX, headY, HEAD_WIDTH, HEAD_HEIGHT);

        // Draw mouth (upside down position where the eyes were)
        int mouthX = centerX - MOUTH_WIDTH / 2;
        int mouthY = headY + HEAD_HEIGHT / 4 - MOUTH_HEIGHT / 2;

        g.setColor(Color.WHITE);
        g.fillRect(mouthX, mouthY, MOUTH_WIDTH, MOUTH_HEIGHT);

        // Draw eyes (upside down position where the mouth was)
        int eyeOffsetX = HEAD_WIDTH / 4;
        int eyeOffsetY = 3 * HEAD_HEIGHT / 4;

        int leftEyeX = headX + eyeOffsetX - EYE_RADIUS / 2;
        int rightEyeX = headX + 3 * eyeOffsetX - EYE_RADIUS / 2;
        int eyeY = headY + eyeOffsetY - EYE_RADIUS / 2;

        g.setColor(Color.YELLOW);
        g.fillOval(leftEyeX, eyeY, EYE_RADIUS, EYE_RADIUS);
        g.fillOval(rightEyeX, eyeY, EYE_RADIUS, EYE_RADIUS);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("UpsideDownRobotFace");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new UpsideDownRobotFace());
        frame.setVisible(true);
    }
}
