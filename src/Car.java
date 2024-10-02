/**
 *  Tính kế thừa: Lớp Car kế thừa từ Vehicle
 * Tính đóng gói: Thuộc tính numberOfSails, engineType được khai báo là private
 */
class Car extends Vehicle {
    private int numberOfWheels;
    private String engineType;


    /**
     * Khởi tạo đối tượng Car.
     *
     * @param numberOfWheels Số bánh xe của ô tô
     * @param engineType Loại động cơ của ô tô (ví dụ: Điện, Xăng)
     * @param speed Tốc độ tối đa của ô tô
     * @param capacity Sức chứa (số người có thể chở được)
     */
    public Car(int numberOfWheels, String engineType, int speed, int capacity) {
        super("Car", speed, capacity);
        this.numberOfWheels = numberOfWheels;
        this.engineType = engineType;
    }



    // Tính đa hình: Ghi đè phương thức specialFunction(),displayUniqueFeatures() từ lớp cha
    /**
     * Triển khai phương thức đặc biệt cho ô tô.
     *
     * @return Không trả về giá trị nào, chỉ in ra chức năng đặc biệt của ô tô.
     */
    @Override
    public void specialFunction() {
        System.out.println("Car specific function: Automatic Parking");
    }


    @Override
    public void displayUniqueFeatures()
    {
        System.out.println("Number of wheels of a car: "+numberOfWheels );
        System.out.println("Car engine type: "+engineType);
    }


    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
