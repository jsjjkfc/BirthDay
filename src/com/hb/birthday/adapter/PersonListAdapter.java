package com.hb.birthday.adapter;

import java.util.List;

import com.hb.birthday.R;
import com.hb.birthday.bean.BirthdayEntity;
import com.hb.birthday.bean.PersonEntity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;

/**
 * ExpandleList生日列表adapter
 * 
 * @author lupeng
 * 
 */
public class PersonListAdapter extends BaseExpandableListAdapter {
	private Context context;
	List<BirthdayEntity> groups;
	List<List<PersonEntity>> childs;
	private LayoutInflater inflater;

	/*
	 * 构造函数: 参数1:context对象 参数2:一级列表数据源 参数3:二级列表数据源
	 */
	public PersonListAdapter(Context context, List<BirthdayEntity> groups,
			List<List<PersonEntity>> child) {
		this.groups = groups;
		this.childs = child;
		this.inflater = LayoutInflater.from(context);
		this.context = context;
	}

	@Override
	public int getGroupCount() {
		return groups.size();
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return childs.get(groupPosition).size();
	}

	@Override
	public Object getGroup(int groupPosition) {
		return groups.get(groupPosition);
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return childs.get(groupPosition).get(childPosition);
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.item_for_contact_parent,
					null);
			// HolderGroup holder = new HolderGroup(convertView);
			// convertView.setTag(holder);
		}
		HolderGroup holderGroup = (HolderGroup) convertView.getTag();
		// 下拉箭头
		// Resources res = convertView.getResources();
		// holderGroup.img = (ImageView)
		// convertView.findViewById(R.id.btn_show);
		// holderGroup.img.setImageBitmap(BitmapFactory.decodeResource(res,
		// R.drawable.ic_arrow_up));
		// if (!isExpanded) {
		// holderGroup.img.setImageBitmap(BitmapFactory.decodeResource(res,
		// R.drawable.ic_arrow_down));
		// }
		// OutPowerEntity entity = groups.get(groupPosition);
		// holderGroup.name.setText(entity.getName());
		// if (entity.getTime() != null) {
		// int blankIndex = entity.getTime().indexOf(" ");
		// String time = entity.getTime().substring(blankIndex + 1);
		// holderGroup.time.setText(time);
		// } else {
		// holderGroup.time.setText("");
		// }
		// holderGroup.count.setText(entity.getCount() + "辆");
		// 隔行换色
		if (groupPosition % 2 == 0) {
			convertView.setBackgroundColor(Color.parseColor("#e8f2fe"));
		} else {
			convertView.setBackgroundColor(Color.parseColor("#ffffff"));
		}
		return convertView;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = inflater.inflate(R.layout.item_for_contact_child,
					null);
			// HolderChild holder = new HolderChild(convertView);
			// convertView.setTag(holder);
		}
		HolderChild holderChild = (HolderChild) convertView.getTag();
		// holderChild.name.setText(childs.get(groupPosition).get(childPosition)
		// .getCarName());
		// holderChild.number.setText(childs.get(groupPosition).get(childPosition)
		// .getCarId());
		// holderChild.status.setText(childs.get(groupPosition).get(childPosition)
		// .getCarStatus());
		//
		// holderChild.distance.setText(String.valueOf(childs.get(groupPosition)
		// .get(childPosition).getCarDistance())
		// + "m");

		// if (childPosition % 2 == 0) {
		// convertView
		// .setBackgroundResource(R.drawable.list_background_lightgreen_selector);
		// } else {
		// convertView
		// .setBackgroundResource(R.drawable.list_background_white_selector);
		// }
		return convertView;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		return true;
	}

	class HolderGroup {
		// public TextView name, time, count;
		// public ImageView img;
		//
		// public HolderGroup(View v) {
		// this.name = (TextView) v.findViewById(R.id.major_team);
		// this.time = (TextView) v.findViewById(R.id.time);
		// this.count = (TextView) v.findViewById(R.id.car_count);
		// }
	}

	class HolderChild {
		// public TextView name, number, status, distance;
		//
		// public HolderChild(View v) {
		// this.name = (TextView) v.findViewById(R.id.name);
		// this.number = (TextView) v.findViewById(R.id.number);
		// this.status = (TextView) v.findViewById(R.id.status);
		// this.distance = (TextView) v.findViewById(R.id.distance);
		// }
	}

}