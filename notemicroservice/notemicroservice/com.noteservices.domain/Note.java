
@Entity
@Table(name="notes")
class Note{
    private int noteId;
    private String author;
    private String description;
    private String status;
    private String title;

    public NOte(){

    }

    public Note(int noteId, String author, String description, String status, String title) {
        this.noteId = noteId;
        this.author = author;
        this.description = description;
        this.status = status;
        this.title = title;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}