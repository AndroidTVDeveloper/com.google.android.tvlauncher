package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.google.android.tvlauncher.R;

/* renamed from: rl  reason: default package */
/* compiled from: PG */
public final class rl extends km {
    public boolean p;
    public boolean q;
    private final SparseArray r;

    public rl(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.r = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        this.r.put(16908304, view.findViewById(16908304));
        this.r.put(16908294, view.findViewById(16908294));
        this.r.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.r.put(16908350, view.findViewById(16908350));
    }

    public final View c(int i) {
        View view = (View) this.r.get(i);
        if (view == null && (view = this.a.findViewById(i)) != null) {
            this.r.put(i, view);
        }
        return view;
    }
}
