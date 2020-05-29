package Omiros.HRDepartment;

public class PunctualityMetrics {
    public PunctualityMetrics(int daysOfWork, int missedDaysOfWork, int unreasonableMissedDaysOfWork) {
        this.daysOfWork = daysOfWork;
        this.missedDaysOfWork = missedDaysOfWork;
        this.unreasonableMissedDaysOfWork = unreasonableMissedDaysOfWork;
    }

    private int daysOfWork;

    public int getDaysOfWork() {
        return daysOfWork;
    }

    public void setDaysOfWork(int daysOfWork) {
        this.daysOfWork = daysOfWork;
    }

    public int getMissedDaysOfWork() {
        return missedDaysOfWork;
    }

    public void setMissedDaysOfWork(int missedDaysOfWork) {
        this.missedDaysOfWork = missedDaysOfWork;
    }

    public int getUnreasonableMissedDaysOfWork() {
        return unreasonableMissedDaysOfWork;
    }

    public void setUnreasonableMissedDaysOfWork(int unreasonableMissedDaysOfWork) {
        this.unreasonableMissedDaysOfWork = unreasonableMissedDaysOfWork;
    }

    private int missedDaysOfWork;
    private int unreasonableMissedDaysOfWork;
}
