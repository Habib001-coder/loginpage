package com.moringaschool.loginpage;

import android.net.Uri;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnLogout;
    private StorageReference mStorageRef;
    private Button BtnChoose;
    private Button BtnUpload;
    private ImageView imageView;
    private Uri filepath;
    private final int PICK_IMAGE_REQUEST = 71;
    private FirebaseAuth.AuthStateListener mAuthStateListener;


}
