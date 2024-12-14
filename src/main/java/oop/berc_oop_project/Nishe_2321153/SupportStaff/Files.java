package oop.berc_oop_project.Nishe_2321153.SupportStaff;

public class Files {
    private String filename;
    private String filetype;
    private String fileaccess;

    public Files(String filename, String filetype, String fileaccess) {
        this.filename = filename;
        this.filetype = filetype;
        this.fileaccess = fileaccess;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getFileaccess() {
        return fileaccess;
    }

    public void setFileaccess(String fileaccess) {
        this.fileaccess = fileaccess;
    }

    @Override
    public String toString() {
        return "Files{" +
                "filename='" + filename + '\'' +
                ", filetype='" + filetype + '\'' +
                ", fileaccess='" + fileaccess + '\'' +
                '}';
    }
}
