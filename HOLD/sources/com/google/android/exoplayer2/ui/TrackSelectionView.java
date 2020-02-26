package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class TrackSelectionView extends LinearLayout {
    public final CheckedTextView a;
    public final CheckedTextView b;
    public final SparseArray c;
    public boolean d;
    private final int e;
    private final LayoutInflater f;
    private final bhh g;

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, com.google.android.exoplayer2.ui.TrackSelectionView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.exoplayer2.ui.TrackSelectionView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public TrackSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        this.c = new SparseArray();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        this.e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        this.f = LayoutInflater.from(context);
        this.g = new bhh(this);
        new cbd(getResources());
        aye aye = aye.a;
        CheckedTextView checkedTextView = (CheckedTextView) this.f.inflate(17367055, (ViewGroup) this, false);
        this.a = checkedTextView;
        checkedTextView.setBackgroundResource(this.e);
        this.a.setText((int) R.string.exo_track_selection_none);
        this.a.setEnabled(false);
        this.a.setFocusable(true);
        this.a.setOnClickListener(this.g);
        this.a.setVisibility(8);
        addView(this.a);
        addView(this.f.inflate((int) R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) this.f.inflate(17367055, (ViewGroup) this, false);
        this.b = checkedTextView2;
        checkedTextView2.setBackgroundResource(this.e);
        this.b.setText((int) R.string.exo_track_selection_auto);
        this.b.setEnabled(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(this.g);
        addView(this.b);
    }
}
