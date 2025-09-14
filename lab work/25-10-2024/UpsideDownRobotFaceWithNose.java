import javax.swing.*;
import java.awt.*;

public class UpsideDownRobotFaceWithNose extends JPanel {

    // Constants for dimensions
    private static final int HEAD_WIDTH = 150;
    private static final int HEAD_HEIGHT = 200;
    private static final int EYE_RADIUS = 20;
    private static final int MOUTH_WIDTH = 60;
    private static final int MOUTH_HEIGHT = 20;
    private static final int NOSE_HEIGHT = 40;
    private static final int NOSE_WIDTH = 2;

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

        // Draw eyes (moved to edges)
        int eyeY = headY + HEAD_HEIGHT / 4; // Vertical position of eyes

        // Left eye at the left edge
        int leftEyeX = headX + 10; // Slight padding from the left edge
        // Right eye at the right edge
        int rightEyeX = headX + HEAD_WIDTH - EYE_RADIUS - 10; // Slight padding from the right edge

        g.setColor(Color.YELLOW);
        g.fillOval(leftEyeX, eyeY, EYE_RADIUS, EYE_RADIUS);
        g.fillOval(rightEyeX, eyeY, EYE_RADIUS, EYE_RADIUS);

        // Draw mouth (centered below the eyes and in the same horizontal line)
        int mouthX = centerX - MOUTH_WIDTH / 2; // Centering mouth horizontally
        int mouthY = eyeY + EYE_RADIUS - 20; // Positioning below the eyes

        g.setColor(Color.WHITE);
        g.fillRect(mouthX, mouthY, MOUTH_WIDTH, MOUTH_HEIGHT);

        // Draw nose (below the mouth)
        int noseX = centerX - NOSE_WIDTH / 2;
        int noseYStart = mouthY + MOUTH_HEIGHT + 10; // Positioning below the mouth
        int noseYEnd = noseYStart + NOSE_HEIGHT;

        g.setColor(Color.BLACK);
        g.fillRect(noseX, noseYStart, NOSE_WIDTH, NOSE_HEIGHT);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("UpsideDownRobotFaceWithNose");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new UpsideDownRobotFaceWithNose());
        frame.setVisible(true);
    }
}