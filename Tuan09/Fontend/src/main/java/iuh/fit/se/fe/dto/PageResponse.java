package iuh.fit.se.fe.dto;

import java.util.List;

public class PageResponse<T> {
    private List<T> content;
    private int number;
    private int size;
    private long totalElements;
    private int totalPages;
    private boolean last;
    // getters setters
}
