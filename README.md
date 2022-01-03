# RMI

RMI là mô hình đối tượng phân tán của Java, nó giúp cho việc truyền thông giữa các đối tượng phân tán được dễ dàng hơn.
 
 
- Đầu tiên trỏ đến thư mục chứa code .java (*src*). Chạy lệnh sau để compile class: `javac *.java`
- Tạo Stub và Skeleton: `rmic HelloImpl;`
- Chạy service RMI: `rmiregistry 5000;`

## Bật tab Terminal thứ 2

- Gõ lệnh: `java HelloImpl`

## Bật tab Terminal thứ 3

- Gõ lệnh: `java RMIClient`