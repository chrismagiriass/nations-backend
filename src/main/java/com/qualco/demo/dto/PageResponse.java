package com.qualco.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class PageResponse<T> {
    private List<T> data;
    private int page;
    private int size;
    private long totalElements;
    private int totalPages;

    public static <T> PageResponse<T> build(List<T> data, int page, int size, int total) {
        int totalPages = (int) Math.ceil((double) total / size);
        return new PageResponse<>(data, page, size, total, totalPages);
    }
}
