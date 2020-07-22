package com.dikamjitborah.hobarb.restcount;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            getTodos(view);
            }
        });
    }

    public void getTodos(View view)
    {
        int i = 0;
        Call<List<Todo>> call = apiInterface.getEU();
        call.enqueue(new Callback<List<Todo>>() {
            @Override
            public void onResponse(Call<List<Todo>> call, Response<List<Todo>> response) {

                List<Todo> countries = response.body();
                for(Todo country:countries)
                {
                    String details = "";
                    details += country.getName() +"=>" + country.getCapital()+", " + country.getFlag()+", "  + country.getRegion()+", "  + country.getSubregion()+ "\n";
                    textView.append( details);
                }


            }

            @Override
            public void onFailure(Call<List<Todo>> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });
    }
}