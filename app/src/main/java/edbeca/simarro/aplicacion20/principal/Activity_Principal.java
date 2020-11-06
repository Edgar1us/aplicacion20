package edbeca.simarro.aplicacion20.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edbeca.simarro.aplicacion20.R;
import edbeca.simarro.aplicacion20.fragment.Activity_fragment_lista;

public class Activity_Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_principal);

        Activity_fragment_lista.Activity_Fragment_Lista frgListado =
                (Activity_fragment_lista.Activity_Fragment_Lista)getSupportFragmentManager()
                .findFragmentById(R.id.FrgListado);

    }
}