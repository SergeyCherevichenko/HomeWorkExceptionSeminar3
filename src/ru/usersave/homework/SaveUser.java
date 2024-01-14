package ru.usersave.homework;
import java.io.FileWriter;
import java.io.IOException;
public class SaveUser  {
    private StringBuilder build;
    private DataUserInput user;

    public SaveUser() throws Exception {
        build = new StringBuilder();
        user = new DataUserInput();
    }

    public void saveUser() {
        String str = build.append(user.getInfo().get(0)).append(" ")
                .append(user.getInfo().get(1)).append(" ")
                .append(user.getInfo().get(2)).append(" ")
                .append(user.getBirthDay1()).append(" ")
                .append(user.getPhoneNumber()).append(" ")
                .append(user.getMale()).toString();

        try (FileWriter writer = new FileWriter
                (   "./src/usersave/" + user.getInfo().get(0) + ".txt",true)) {
            writer.write(str);
            writer.write("\n");

        } catch (IOException e) {
            System.out.println("Ошибка при записи файла!");
            e.printStackTrace();
        }
    }
}
