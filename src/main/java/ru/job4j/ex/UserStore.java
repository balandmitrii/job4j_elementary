package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                return users[i];
            }
        }
        throw new UserNotFoundException("User not found.");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User not valid.");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("User name less than 3 letters.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Chuck Norris", true),
                new User("Murato Hikimori", false),
                new User("Cu", true),
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.err.println(e.getMessage());
        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}