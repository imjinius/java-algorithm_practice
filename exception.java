class PasswordException extends Exception{
    PasswordException(String msg){
        super(msg);
    }
}

public class exception {
    String password;

    public void setUserPw(String pw) throws PasswordException{
        if(pw == null){
            throw new PasswordException("비밀번호는 null일수 없습니다.");
        }
        else if(pw.length()<5){
            throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
        }
        else if(pw.matches("[a-zA-Z]+")) {
            throw new PasswordException("비밀번호는 숫자,문자를 조합하여야 합니다.");  
        }
    }

    public static void main(String[] args){
        exception ex = new exception();
        String pw = null;

        try {
            ex.setUserPw(pw);
        } catch (PasswordException e) {
           
            e.getMessage();
        }

        pw = "123";
        try {
            ex.setUserPw(pw);
        } catch (PasswordException e) {
            
            e.printStackTrace();
            e.getMessage();
        }
        
        pw = "abcdef";
        try {
            ex.setUserPw(pw);
        } catch (PasswordException e) {
            
            e.printStackTrace();
            e.getMessage();
        }
    }
    

}