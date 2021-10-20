package com.example.weteach;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class RegisterStep2Activity extends AppCompatActivity {

    private ImageButton btnFrontIC;
    private ImageButton btnBackIC;
    private ImageButton btnCetification;

    private ImageView imgvFontIC;
    private ImageView imgvBackIC;
    private ImageView imgvCertificate;
    private static final int IMAGE_PICK_CODE = 1000;
    private static final int PERMISSION_CODE = 1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_step2);

        Button btnSignin = findViewById(R.id.btnSignin2);
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(RegisterStep2Activity.this,RegisterTeachingActivity.class);
                RegisterStep2Activity.this.startActivity(_intent);
            }
        });
//        btnBackIC = (ImageButton) findViewById(R.id.btnBackIC);
//        btnFrontIC = (ImageButton) findViewById(R.id.btnFrontIC);
//        btnCetification = (ImageButton) findViewById(R.id.btnCertificate);
//
//        imgvBackIC = (ImageView) findViewById(R.id.imgvBackIC);
//        imgvFontIC = (ImageView) findViewById(R.id.imgvFrontIC);
//        imgvCertificate = (ImageView) findViewById(R.id.imgvCertificate);
//        btnFrontIC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                choosePicture();
//            }
//        });
//        btnBackIC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                choosePictureForBackIC();
//            }
//        });
//        btnCetification.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                choosePictureForCT();
//            }
//        });
    }
    private void choosePicture(){
        AlertDialog.Builder builder = new AlertDialog.Builder(RegisterStep2Activity.this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.choose_image, null);
        builder.setCancelable(false);
        builder.setView(dialogView);

        ImageView imgvCamera  = dialogView.findViewById(R.id.imgvCamera);
        ImageView imgvBrowser = dialogView.findViewById(R.id.imgvBrowser);


        AlertDialog alertDialogPicture = builder.create();
        alertDialogPicture.setCancelable(true);
        alertDialogPicture.show();

        imgvCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( checkAndRequestPermission()){
                    takePictureFromCameraForFrontIC();
                    alertDialogPicture.cancel();
                }
            }
        });

        imgvBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takePictureFromGalleryForFrontIC();
                alertDialogPicture.cancel();
            }
        });
    }
    private void choosePictureForBackIC(){
        AlertDialog.Builder builder = new AlertDialog.Builder(RegisterStep2Activity.this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.choose_image, null);
        builder.setCancelable(false);
        builder.setView(dialogView);

        ImageView imgvCamera  = dialogView.findViewById(R.id.imgvCamera);
        ImageView imgvBrowser = dialogView.findViewById(R.id.imgvBrowser);


        AlertDialog alertDialogPicture = builder.create();
        alertDialogPicture.show();

        imgvCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( checkAndRequestPermission()){
                    takePictureFromCameraForBackIC();
                    alertDialogPicture.cancel();
                }
            }
        });

        imgvBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takePictureFromGalleryForBackIC();
                alertDialogPicture.cancel();
            }
        });
    }
    private void choosePictureForCT(){
        AlertDialog.Builder builder = new AlertDialog.Builder(RegisterStep2Activity.this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.choose_image, null);
        builder.setCancelable(false);
        builder.setView(dialogView);

        ImageView imgvCamera  = dialogView.findViewById(R.id.imgvCamera);
        ImageView imgvBrowser = dialogView.findViewById(R.id.imgvBrowser);


        AlertDialog alertDialogPicture = builder.create();
        alertDialogPicture.show();

        imgvCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( checkAndRequestPermission()){
                    takePictureFromCameraForCT();
                    alertDialogPicture.cancel();
                }
            }
        });

        imgvBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takePictureFromGalleryForCT();
                alertDialogPicture.cancel();
            }
        });
    }

    private void takePictureFromGalleryForFrontIC(){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(pickPhoto,1);
    }
    private void takePictureFromCameraForFrontIC(){
        Intent takePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePicture.resolveActivity(getPackageManager()) != null){
            startActivityForResult(takePicture,2);
        }
    }
    private void takePictureFromGalleryForBackIC(){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(pickPhoto,3);
    }
    private void takePictureFromCameraForBackIC(){
        Intent takePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePicture.resolveActivity(getPackageManager()) != null){
            startActivityForResult(takePicture,4);
        }
    }
    private void takePictureFromGalleryForCT(){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(pickPhoto,5);
    }
    private void takePictureFromCameraForCT(){
        Intent takePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePicture.resolveActivity(getPackageManager()) != null){
            startActivityForResult(takePicture,6);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = data.getData();
                    imgvFontIC.setImageURI(selectedImage);
                }
                break;
            case 2:
                if(resultCode == RESULT_OK){
                    Bundle bundle = data.getExtras();
                    Bitmap bitmapImage = (Bitmap)  bundle.get("data");
                    imgvFontIC.setImageBitmap(bitmapImage);
                }
                break;
            case 3:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = data.getData();
                    imgvBackIC.setImageURI(selectedImage);}
                break;
            case 4:
                if(resultCode == RESULT_OK){
                    Bundle bundle = data.getExtras();
                    Bitmap bitmapImage = (Bitmap)  bundle.get("data");
                    imgvBackIC.setImageBitmap(bitmapImage);
                }
                break;
            case 5:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = data.getData();
                    imgvCertificate.setImageURI(selectedImage);}
                break;
            case 6:
                if(resultCode == RESULT_OK){
                    Bundle bundle = data.getExtras();
                    Bitmap bitmapImage = (Bitmap)  bundle.get("data");
                    imgvCertificate.setImageBitmap(bitmapImage);
                }
                break;
        }

    }
    private  boolean checkAndRequestPermission(){
        if(Build.VERSION.SDK_INT >= 23){
            int cameraPermission = ActivityCompat.checkSelfPermission(RegisterStep2Activity.this, Manifest.permission.CAMERA);
            if( cameraPermission == PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(RegisterStep2Activity.this, new String[]{Manifest.permission.CAMERA},20);
                return false;
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 20 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            takePictureFromCameraForBackIC();
            takePictureFromCameraForFrontIC();
            takePictureFromCameraForCT();

        }else{
            Toast.makeText(RegisterStep2Activity.this,"Permission not Granted",Toast.LENGTH_LONG).show();
        }
    }
}