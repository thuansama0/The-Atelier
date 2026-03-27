package com.axyl.the_atelier;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_in);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.signInRoot), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(v -> {
            // Non-functional shell in design; keep tap harmless for now.
        });

        TextView title = findViewById(R.id.title);
        SpannableString titleText = new SpannableString("Welcome Back.");
        int dotIndex = titleText.length() - 1;
        titleText.setSpan(
                new ForegroundColorSpan(getColor(R.color.atelier_primary)),
                dotIndex,
                dotIndex + 1,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        title.setText(titleText);

        EditText emailInput = findViewById(R.id.emailInput);
        EditText passwordInput = findViewById(R.id.passwordInput);

        Button signInButton = findViewById(R.id.signInButton);
        Button googleButton = findViewById(R.id.googleButton);
        Button appleButton = findViewById(R.id.appleButton);

        TextView forgotPassword = findViewById(R.id.forgotPassword);
        TextView createAccount = findViewById(R.id.createAccount);

        View.OnClickListener noop = v -> {
            // Wiring (auth/navigation) can be added later.
        };

        signInButton.setOnClickListener(noop);
        googleButton.setOnClickListener(noop);
        appleButton.setOnClickListener(noop);
        forgotPassword.setOnClickListener(noop);
        createAccount.setOnClickListener(noop);

        // Provide light sample values in preview/dev builds if desired
        emailInput.setText("");
        passwordInput.setText("");
    }
}
