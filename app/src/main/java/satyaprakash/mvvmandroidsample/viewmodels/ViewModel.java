package satyaprakash.mvvmandroidsample.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import satyaprakash.mvvmandroidsample.models.Customer;

public class ViewModel extends AndroidViewModel {
     Customer customer;
    public ViewModel(@NonNull Application application) {
        super(application);

        customer=new Customer("satya prakash");

    }

    public Customer getCustomer() {
        return customer;
    }
}
