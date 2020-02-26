package com.google.android.exoplayer2.p003ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.tvlauncher.R;

/* renamed from: com.google.android.exoplayer2.ui.TrackSelectionView */
/* compiled from: PG */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: a */
    public final CheckedTextView f6237a;

    /* renamed from: b */
    public final CheckedTextView f6238b;

    /* renamed from: c */
    public final SparseArray f6239c;

    /* renamed from: d */
    public boolean f6240d;

    /* renamed from: e */
    private final int f6241e;

    /* renamed from: f */
    private final LayoutInflater f6242f;

    /* renamed from: g */
    private final bhh f6243g;

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
        this.f6239c = new SparseArray();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        this.f6241e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        this.f6242f = LayoutInflater.from(context);
        this.f6243g = new bhh(this);
        new cbd(getResources());
        aye aye = aye.f2750a;
        CheckedTextView checkedTextView = (CheckedTextView) this.f6242f.inflate(17367055, (ViewGroup) this, false);
        this.f6237a = checkedTextView;
        checkedTextView.setBackgroundResource(this.f6241e);
        this.f6237a.setText((int) R.string.exo_track_selection_none);
        this.f6237a.setEnabled(false);
        this.f6237a.setFocusable(true);
        this.f6237a.setOnClickListener(this.f6243g);
        this.f6237a.setVisibility(8);
        addView(this.f6237a);
        addView(this.f6242f.inflate((int) R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) this.f6242f.inflate(17367055, (ViewGroup) this, false);
        this.f6238b = checkedTextView2;
        checkedTextView2.setBackgroundResource(this.f6241e);
        this.f6238b.setText((int) R.string.exo_track_selection_auto);
        this.f6238b.setEnabled(false);
        this.f6238b.setFocusable(true);
        this.f6238b.setOnClickListener(this.f6243g);
        addView(this.f6238b);
    }
}
