package com.sms.thinkgeniux.sms_marketing.AdaptersHolderItemToch;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sms.thinkgeniux.sms_marketing.PojoClass.GroupItem;
import com.sms.thinkgeniux.sms_marketing.R;

import java.util.ArrayList;

/**
 * Created by Neophyte Coder on 20/12/16.
 */
public class GroupBrandsAdapter extends RecyclerView.Adapter<ContactGroupBrandHolder> {
    ArrayList<GroupItem> arrayList=new ArrayList<>();
    Activity activity;

    public GroupBrandsAdapter(ArrayList<GroupItem> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @Override
    public ContactGroupBrandHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.group_names_item, parent, false);

        return new ContactGroupBrandHolder(view, activity);
    }

    @Override
    public void onBindViewHolder(ContactGroupBrandHolder holder, int position) {
        holder.InflatingItems(arrayList.get(position).getGroup_Id(), arrayList.get(position).getGroup_Name());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
