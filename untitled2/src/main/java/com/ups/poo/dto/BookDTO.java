package main.java.com.ups.poo.dto;

public class BookDTO {
    String title;
    String editorial;

    AuthorDTO authorDTO;
    public BookDTO(){}

    public BookDTO(String title, String editorial, String publisher) {
        this.title = title;
        this.editorial = editorial;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public AuthorDTO getAuthorDTO() {
        return authorDTO;
    }

    public void setAuthorDTO(AuthorDTO authorDTO) {
        this.authorDTO = authorDTO;
    }
}

