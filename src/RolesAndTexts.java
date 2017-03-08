import java.util.Arrays;
/**
 * Created by volfovskaya on 08.03.17.
 */
public class RolesAndTexts {
    String[] roles = new String[]{"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
    String[] textLines = new String[]{
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
    };



    private String printTextPerRole(String[] roles, String[] textLines) {
        return Arrays.toString(roles);
    }

    public static void main(String[] args) {
        RolesAndTexts testRolesAndTexts = new RolesAndTexts();
        System.out.println(Arrays.toString(testRolesAndTexts.roles));
        System.out.println(Arrays.toString(testRolesAndTexts.textLines));
    }
}
