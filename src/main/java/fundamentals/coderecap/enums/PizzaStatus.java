package fundamentals.coderecap.enums;

public enum PizzaStatus {
    ORDERED(3){
        @Override
        public boolean isOrdered() {
            return true;
        }
    },
    READY(2){
        @Override
        public boolean isReady() {
            return true;
        }
    },
    DELIVERED(0){
        @Override
        public boolean isDelivered() {
            return true;
        }
    };

    private int timeToDeliver;

    public boolean isOrdered() {
        return false;
    }

    public boolean isReady() {
        return false;
    }

    public boolean isDelivered() {
        return false;
    }

    PizzaStatus(int timeToDeliver) {
        this.timeToDeliver = timeToDeliver;
    }

    public int getTimeToDeliver() {
        return timeToDeliver;
    }
}
