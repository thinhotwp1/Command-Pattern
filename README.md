
Link github Sample:  https://github.com/thinhotwp1/Command-Pattern.git
Chương 6: Command Pattern – Đóng gói yêu cầu
https://toihocdesignpattern.com/chuong-6-command-pattern-dong-goi-yeu-cau.html

Tóm tắt
Command Pattern tách riêng một đối tượng, và đưa ra yêu cầu tới đối tượng biết cách thực hiện nó.
Một đối tượng Command nằm ở trung tâm của việc tách rời này và đóng gói một receiver bằng một hành động (hoặc tập hợp các hành động).
Một invoker đưa ra yêu cầu của một đối tượng Command bằng cách gọi phương thức execute() của nó, gọi các hành động đó trên receiver.
Invoker có thể được tham số hóa bằng các Command, thậm chí là gán động khi chạy.
Command có thể hỗ trợ undo bằng cách thực hiện một phương thức undo khôi phục đối tượng về trạng thái trước đó trước khi phương thức execute() được gọi lần cuối.
Macro Commands là một phần mở rộng đơn giản của Command cho phép nhiều command được gọi. Tương tự, Macro Commands có thể dễ dàng hỗ trợ undo().
