package day21_forloop_4_arrayintro;

public class LookForError {
    public static void main(String[] args) {
        String log = "<error:atable style=display: none;<tbody><error:btr id=edit_rubric><td " +
                "coerror:qlspan=4><form id=error:jedit_rubric_form class=edit-" +
                "rubric-formerror:p no-margin-bottom>error:a";
        int errorCount = 0;
        for (int i = 0; i < log.length()-4; i++) {
            String tempStr = log.substring(i, i + 5);
            if (tempStr.equals("error")){

                System.out.println("error found at index - " + i);
            errorCount++;
            System.out.println("error type: "+log.charAt(i+6));
        }




    }

}
}
