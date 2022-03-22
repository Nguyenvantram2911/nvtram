package vn.edu.ntu.mysimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editSoA,editSoB;
    TextView textViewKetQua;
    Button nutCong,nutTru,nutNhan,nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editSoA=(EditText)findViewById(R.id.edtA);
        editSoB=(EditText)findViewById(R.id.edtB);
        textViewKetQua=(TextView)findViewById(R.id.tvKetQua);
    }
    void TimWidget(){
        nutCong=(Button)findViewById(R.id.btnAdd);
        nutTru=(Button)findViewById(R.id.btnSub);
        nutNhan=(Button)findViewById(R.id.btnMul);
        nutChia=(Button)findViewById(R.id.btnDiv);
    }
    public void XuLy_Cong(View k){
        //Lấy dữ liệu
        String sA=editSoA.getText().toString();
        String sB=editSoB.getText().toString();
        //Chuyển đổi kiểu số
        int a=Integer.parseInt(sA);
        int b=Integer.parseInt(sB);
        //Tính
        int tong=a+b;
        //Chuyển tổng thành chuỗi
        String chuoiTong=String.valueOf(tong);
        //Xuất kết quả
        textViewKetQua.setText("Tổng là:" + chuoiTong);
    }
    public void XuLyTru(View k){
        String sA=editSoA.getText().toString();
        String sB=editSoB.getText().toString();
        int a=Integer.parseInt(sA);
        int b=Integer.parseInt(sB);
        int hieu=a-b;
        String chuoiHieu=String.valueOf(hieu);
        textViewKetQua.setText("Hiệu là:" + chuoiHieu);
    }
    public void XuLyNhan(View k){
        String sA=editSoA.getText().toString();
        String sB=editSoB.getText().toString();
        int a=Integer.parseInt(sA);
        int b=Integer.parseInt(sB);
        int tich=a*b;
        String chuoiTich=String.valueOf(tich);
        textViewKetQua.setText("Tích là:" + chuoiTich);
    }
    public void XuLyChia(View k){
        String sA=editSoA.getText().toString();
        String sB=editSoB.getText().toString();
        int a=Integer.parseInt(sA);
        int b=Integer.parseInt(sB);
        int thuong=a/b;
        String chuoiThuong=String.valueOf(thuong);
        textViewKetQua.setText("Thương là:" + chuoiThuong);
    }

    public void XuLy_Chia(View view) {
    }
}
