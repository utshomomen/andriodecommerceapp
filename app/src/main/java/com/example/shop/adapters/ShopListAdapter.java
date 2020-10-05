package com.example.shop.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shop.databinding.ShopRowBinding;
import com.example.shop.models.Product;
import com.example.shop.views.ProductDetailFragment;

public class ShopListAdapter extends ListAdapter<Product, ShopListAdapter.ShopViewHolder> {

    ShopInterface shopInterface;
    public ShopListAdapter(ShopInterface shopInterface) {
        super(Product.itemCallback);
       this.shopInterface = shopInterface;
    }



    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ShopRowBinding shopRowBinding = ShopRowBinding.inflate(layoutInflater, parent, false);
shopRowBinding.setShopInterface(shopInterface);
        return new ShopViewHolder(shopRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ShopViewHolder holder, int position) {
Product product = getItem(position);
holder.shopRowBinding.setProduct(product);
    }

    class  ShopViewHolder extends RecyclerView.ViewHolder{

        ShopRowBinding shopRowBinding;
        public ShopViewHolder(ShopRowBinding binding) {
            super(binding.getRoot());
            this.shopRowBinding = binding;

        }
    }


    public  interface  ShopInterface {

        void addItem(Product product);
        void onItemClick(Product product);
    }

}
