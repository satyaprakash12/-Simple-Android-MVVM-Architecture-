package satyaprakash.mvvmandroidsample.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import satyaprakash.mvvmandroidsample.R;
import satyaprakash.mvvmandroidsample.models.Customer;
import satyaprakash.mvvmandroidsample.databinding.ActivityMainBinding;
import satyaprakash.mvvmandroidsample.viewmodels.ViewModel;

public class MainActivity extends AppCompatActivity {
    ViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);

        //ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        //setContentView(binding.getRoot());
        //Customer customer=new Customer("I, satya prakash, am working as an android developer at IIIT Naya Raipur");

   viewModel= ViewModelProviders.of(this).get(ViewModel.class);
        activityMainBinding.setCustomer(viewModel.getCustomer());

    }
}