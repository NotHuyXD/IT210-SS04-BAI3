Trong Cách A, số 5 đóng vai trò là một phần của URI Path (Đường dẫn định danh tài nguyên).

Trong Cách B, số 5 nằm trong Query String (Chuỗi truy vấn), bắt đầu sau dấu chấm hỏi ?.

Theo chuẩn thiết kế RESTful, khi muốn lấy hoặc tác động lên một tài nguyên duy nhất đã xác định rõ (như một đơn hàng cụ thể), chúng ta đưa ID thẳng vào URI Path. Query String chỉ nên được sử dụng khi cần lọc, phân trang hoặc tìm kiếm trên một danh sách (ví dụ: ?status=pending).

Kết luận: Mình chọn Cách A kết hợp với @PathVariable. Đây là thiết kế chuẩn xác, rõ ràng và chuyên nghiệp nhất để truy xuất chi tiết một đơn hàng.