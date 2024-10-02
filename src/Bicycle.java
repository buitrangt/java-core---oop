/**
 * Tính kế thừa: Lớp Bicycle kế thừa từ Vehicle
 * Tính đóng gói: Thuộc tính numberOfWheels được khai báo là private
 */
class Bicycle extends Vehicle {
    private int numberOfWheels;


    /**
     * Khởi tạo đối tượng Bicycle.
     *
     * @param numberOfWheels Số bánh xe của xe đạp
     * @param speed Tốc độ của phương tiện
     * @param capacity Sức chứa của phương tiện (số người chở được)
     */
    public Bicycle(int numberOfWheels, int speed, int capacity) {
        super("Bicycle", speed, capacity);
        this.numberOfWheels = numberOfWheels;
    }


    // Tính đa hình: Ghi đè phương thức specialFunction(),displayUniqueFeatures() từ lớp cha
    /**
     * Triển khai phương thức đặc biệt cho xe đạp.
     *
     * @return Không trả về giá trị nào, chỉ in ra chức năng đặc biệt của xe đạp.
     */
    @Override
    public void specialFunction()
    {
        System.out.println("Bicycle specific function: Exercise");
    }

    @Override
    public void displayUniqueFeatures()
    {
        System.out.println("Number of wheels of bicycle: "+numberOfWheels);
    }



    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
