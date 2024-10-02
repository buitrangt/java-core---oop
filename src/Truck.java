/**
 * Tính kế thừa: Lớp Truck kế thừa từ Vehicle
 * Tính đóng gói: Thuộc tính numberOfWheels và cargoCapacity được khai báo là private
 */
class Truck extends Vehicle {
    private int numberOfWheels;
    private int cargoCapacity;

    /**
     * Khởi tạo đối tượng Truck.
     *
     * @param numberOfWheels Số bánh xe của xe tai.
     * @param speed Tốc độ của phương tiện
     * @param capacity Sức chứa của phương tiện (số người chở được)
     * @param cargoCapacity Sức chứa hàng hóa
     */
    public Truck(int numberOfWheels, int cargoCapacity, int speed, int capacity) {
        // Tính kế thừa: Sử dụng super để gọi constructor của lớp cha (Vehicle)
        super("Truck", speed, capacity);
        this.numberOfWheels = numberOfWheels;
        this.cargoCapacity = cargoCapacity;
    }


    // Tính đa hình: Ghi đè phương thức specialFunction(),displayUniqueFeatures() từ lớp cha
    /**
     * Triển khai phương thức đặc biệt cho xe tải.
     *
     * @return Không trả về giá trị nào, chỉ in ra chức năng đặc biệt của xe tải.
     */
    @Override
    public void specialFunction() {
        System.out.println("Truck specific function: Heavy Cargo Transport");
    }

    @Override
    public void displayUniqueFeatures()
    {
        System.out.println("Number of wheels of the truck: "+numberOfWheels );
        System.out.println("Truck cargo capacity: "+cargoCapacity );
    }




    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
