abstract class Vehicle implements Moveable {
    private String type;
    private int speed;
    private int capacity;

    // Constructor
    /**
     * Khởi tạo đối tượng Truck.
     *
     * @param type loai phương tiện
     * @param speed Tốc độ của phương tiện
     * @param capacity Sức chứa của phương tiện (số người chở được)
     */
    public Vehicle(String type, int speed, int capacity) {
        this.type = type;
        this.speed = speed;
        this.capacity = capacity;
    }


    /**
     * Di chuyển phương tiện.
     *
     * @return Không trả về giá trị nào, chỉ in ra rằng phương tiện đang di chuyển.
     */
    public void move() {
        System.out.println(type + " is moving.");
    }



    public abstract void specialFunction();
    public abstract void displayUniqueFeatures();




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
