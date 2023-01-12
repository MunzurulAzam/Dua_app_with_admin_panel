//package com.example.islamic_app;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.List;
//
//public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
//
//
//    private List<ModelClass> userList;
//
//    public Adapter (List<ModelClass>userList){this.userList=userList;}
//
//    @NonNull
//    @Override
//    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
//
////        int photo= userList.get(position).getImageview1();
//        String info= userList.get(position).getTextView();
//
//        holder.setData(info);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return userList.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
////        change parameter for conflict with previous name
////        private ImageView imageView;
//        private TextView textView1;
//
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//
////            imageView=itemView.findViewById(R.id.imageview1);
//            textView1=itemView.findViewById(R.id.textView);
//
//        }
//
//        public void setData( String info) {
//
////            imageView.setImageResource(photo);
//            textView1.setText(info);
//        }
//    }
//}
