/**
 *  Tính kế thừa: Lớp Boat kế thừa từ Vehicle*
 * Tính đóng gói: Thuộc tính numberOfSails được khai báo là private
 */
class Boat extends Vehicle {
    private int numberOfSails;

    /**
     * Khởi tạo đối tượng Boat.
     *
     * @param numberOfSails So canh buom cua thuyen
     * @param speed Tốc độ của phương tiện
     * @param capacity Sức chứa của phương tiện (số người chở được)
     */
    public Boat(int numberOfSails, int speed, int capacity) {
        super("Boat", speed, capacity);
        this.numberOfSails = numberOfSails;
    }


    // Tính đa hình: Ghi đè phương thức specialFunction(), displayUniqueFeatures() từ lớp cha
    /**
     * Triển khai phương thức đặc biệt cho thuyen.
     *
     * @return Không trả về giá trị nào, chỉ in ra chức năng đặc biệt của thuyen.
     */
    @Override
    public void specialFunction() {
        System.out.println("Boat specific function: Sailing on Water");
    }


    @Override
    public void displayUniqueFeatures()
    {
        System.out.println("number of sails on a ship: "+numberOfSails);
    }


    public int getNumberOfSails() {
        return numberOfSails;
    }

    public void setNumberOfSails(int numberOfSails) {
        this.numberOfSails = numberOfSails;
    }
}
