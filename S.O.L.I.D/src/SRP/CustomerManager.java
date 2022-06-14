package SRP;
// SRP fundamental
public class CustomerManager {
    public void TransactionalOperation(){
        Insert();
        Update();
    }
    private void Insert(){
        MyContext context=new MyContext();
        context.Update();

    }
    private void Update(){
        MyContext context=new MyContext();
        context.Insert();
    }

}

