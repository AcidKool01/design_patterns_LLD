package CompositePattern.FileSystemProblem;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class File {
    String fileName;

    public void ls() {
        System.out.println("File Name: " + fileName);
    }
}
