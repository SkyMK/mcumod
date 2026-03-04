package mcu.movement;

public class MovementUtils implements MovementData {
    private static MovementUtils instance;
    public double modMotionX;
    public double modMotionY;
    public double modMotionZ;
    public float nextStepDistance;

    public static MovementUtils getInstance() {
        if (instance == null)
            instance = new MovementUtils();
        return instance;
    }

    @Override
    public float modSprinting() {
        return MovementClient.sprinting;
    }

    @Override
    public void modSprinting(final float sprinting) {
        MovementClient.sprinting = sprinting;
    }

    @Override
    public float nextStepDistance() {
        return this.nextStepDistance;
    }

    @Override
    public void nextStepDistance(final float nextStepDistance) {
        this.nextStepDistance = nextStepDistance;
    }
}
