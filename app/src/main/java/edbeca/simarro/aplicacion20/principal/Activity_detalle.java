package edbeca.simarro.aplicacion20.principal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edbeca.simarro.aplicacion20.R;
import edbeca.simarro.aplicacion20.fragment.Activity_fragment_detalle;

public class Activity_detalle extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_detalle);

        Activity_fragment_detalle detalle =
                (Activity_fragment_detalle)getSupportFragmentManager()
                        .findFragmentById(R.id.FrgListado);
        detalle.mostrarDetalle(getIntent().getStringExtra("TextoDetalle"));
    }
}
