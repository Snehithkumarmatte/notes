import javax.swing.*;
import java.awt.*;

public class ReverseRobotFace extends JPanel {

    // Constants for the robot's face dimensions
    private static final int HEAD_WIDTH = 200;
    private static final int HEAD_HEIGHT = 300;
    private static final int EYE_RADIUS = 30;
    private static final int MOUTH_WIDTH = 100;
    private static final int MOUTH_HEIGHT = 50;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Convert Graphics to Graphics2D to allow for transformations
        Graphics2D g2d = (Graphics2D) g;

        // Set line thickness
        g2d.setStroke(new BasicStroke(3));

        // Get the width and height of the panel
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // Calculate the top-left corner of the head to center it
        int headX = (panelWidth - HEAD_WIDTH) / 2;
        int headY = (panelHeight - HEAD_HEIGHT) / 2;

        // Draw the head (gray fill with a black border)
        g2d.setColor(Color.GRAY);
        g2d.fillRect(headX, headY, HEAD_WIDTH, HEAD_HEIGHT);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(headX, headY, HEAD_WIDTH, HEAD_HEIGHT);

        // Draw the mouth at the top (white fill with a black border)
        int mouthX = headX + (HEAD_WIDTH - MOUTH_WIDTH) / 2;
        int mouthY = headY + HEAD_HEIGHT / 4 - MOUTH_HEIGHT / 2;
        g2d.setColor(Color.WHITE);
        g2d.fillRect(mouthX, mouthY, MOUTH_WIDTH, MOUTH_HEIGHT);
        g2d.setColor(Color.BLACK);
        g2d.drawRect(mouthX, mouthY, MOUTH_WIDTH, MOUTH_HEIGHT);

        // Draw the eyes at the bottom
        int eyeY = headY + 3 * HEAD_HEIGHT / 4 - EYE_RADIUS; // Move eyes down
        int leftEyeX = headX + HEAD_WIDTH / 4 - EYE_RADIUS;
        int rightEyeX = headX + 3 * HEAD_WIDTH / 4 - EYE_RADIUS;

        // Draw the eyes (yellow fill with a black border)
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(leftEyeX, eyeY, EYE_RADIUS * 2, EYE_RADIUS * 2);
        g2d.fillOval(rightEyeX, eyeY, EYE_RADIUS * 2, EYE_RADIUS * 2);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(leftEyeX, eyeY, EYE_RADIUS * 2, EYE_RADIUS * 2);
        g2d.drawOval(rightEyeX, eyeY, EYE_RADIUS * 2, EYE_RADIUS * 2);

        // Draw the vertical line between the eyes, limited to the eyes' height
        int centerX = headX + HEAD_WIDTH / 2; // Center of the head
        int lineStartY = eyeY + EYE_RADIUS / 2;          // Just above the top of the eyes
        int lineEndY = eyeY + EYE_RADIUS * 3 / 2;        // Just below the bottom of the eyes
        g2d.setColor(Color.BLACK);
        g2d.drawLine(centerX, lineStartY, centerX, lineEndY);
    }

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Reversed Robot Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        // Add the ReverseRobotFace panel
        ReverseRobotFace robotFace = new ReverseRobotFace();
        frame.add(robotFace);

        // Show the frame
        frame.setVisible(true);
    }
}