# Java OOP - Kế thừa, Đa hình, Lớp trừu tượng và Tính đóng gói

## Mô tả:

Dự án này minh họa các khái niệm cốt lõi của Lập trình Hướng đối tượng (OOP) sử dụng Java. Dự án triển khai một hệ thống phương tiện bao gồm Ô tô, Xe đạp, Thuyền và Xe tải. Mỗi lớp thể hiện các nguyên tắc OOP như kế thừa, đa hình, lớp trừu tượng và tính đóng gói.

## Các khái niệm OOP chính:

1. **Kế thừa**:
    - Lớp `Vehicle` là lớp trừu tượng được mở rộng bởi các lớp `Car`, `Bicycle`, `Boat`, và `Truck`. Điều này cho phép các lớp con kế thừa các thuộc tính và phương thức chung từ lớp cha.

2. **Đa hình**:
    - Mỗi lớp phương tiện ghi đè phương thức `specialFunction()`, với mỗi lớp con sẽ triển khai hành vi đặc trưng riêng cho từng loại phương tiện (ví dụ: Ô tô có "Automatic Parking", Xe đạp có "Exercise").

3. **Lớp trừu tượng**:
    - `Vehicle` là lớp trừu tượng định nghĩa các thuộc tính và phương thức chung (như `move()`), nhưng để lại các phương thức như `specialFunction()` cho các lớp con triển khai.

4. **Tính đóng gói (Encapsulation)**:
    - Mỗi lớp đều có các thuộc tính riêng tư (`private`), chẳng hạn như `numberOfWheels`, `cargoCapacity`, `numberOfSails` trong các lớp `Car`, `Truck`, `Boat`, và `Bicycle`. Điều này đảm bảo rằng các thuộc tính của đối tượng chỉ có thể được truy cập thông qua các phương thức của chính đối tượng đó, bảo vệ dữ liệu và ẩn giấu việc triển khai bên trong.
    - Mặc dù các getter và setter chưa được triển khai, nhưng việc sử dụng từ khóa `private` cho các thuộc tính đã thể hiện rõ tính đóng gói.

5. **Giao diện (Interface)**:
    - Giao diện `Moveable` chứa phương thức `move()` và đảm bảo tất cả các lớp phương tiện đều có khả năng di chuyển.

## Mô tả các lớp:

1. **Vehicle**:
    - Lớp trừu tượng này chứa các thuộc tính chung như `type`, `speed`, và `capacity`, đồng thời định nghĩa phương thức `move()`. Nó có một phương thức trừu tượng là `specialFunction()`, được triển khai bởi các lớp con.

2. **Moveable**:
    - Giao diện này có phương thức `move()`, đảm bảo tất cả các phương tiện đều có thể di chuyển.

3. **Car**:
    - Kế thừa từ `Vehicle`, có các thuộc tính cụ thể như `numberOfWheels` và `engineType`. Phương thức `specialFunction()` in ra "Automatic Parking". Tính đóng gói thể hiện qua việc thuộc tính `numberOfWheels` là `private`.

4. **Bicycle**:
    - Kế thừa từ `Vehicle`, có thuộc tính `numberOfWheels`. Phương thức `specialFunction()` in ra "Exercise". Tính đóng gói thể hiện qua việc thuộc tính `numberOfWheels` là `private`.

5. **Boat**:
    - Kế thừa từ `Vehicle`, có thuộc tính `numberOfSails`. Phương thức `specialFunction()` in ra "Sailing on Water". Tính đóng gói thể hiện qua việc thuộc tính `numberOfSails` là `private`.

6. **Truck**:
    - Kế thừa từ `Vehicle`, có thuộc tính `numberOfWheels` và `cargoCapacity`. Phương thức `specialFunction()` in ra "Heavy Cargo Transport". Tính đóng gói thể hiện qua các thuộc tính `numberOfWheels` và `cargoCapacity` là `private`.

## Cách chạy:

1. Biên dịch tất cả các file Java trong IDE hoặc qua dòng lệnh.
2. Chạy lớp `Main`, lớp này sẽ tạo các đối tượng của `Car`, `Bicycle`, `Boat`, và `Truck`.
3. Chương trình sẽ gọi phương thức `move()` cho từng phương tiện, sau đó gọi phương thức `specialFunction()` để hiển thị hành vi đặc trưng của từng phương tiện.
