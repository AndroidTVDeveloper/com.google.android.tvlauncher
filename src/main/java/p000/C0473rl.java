package p000;

import android.util.SparseArray;
import android.view.View;
import com.google.android.tvlauncher.R;

/* renamed from: rl */
/* compiled from: PG */
public final class C0473rl extends C0285km {

    /* renamed from: p */
    public boolean f10259p;

    /* renamed from: q */
    public boolean f10260q;

    /* renamed from: r */
    private final SparseArray f10261r;

    public C0473rl(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f10261r = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        this.f10261r.put(16908304, view.findViewById(16908304));
        this.f10261r.put(16908294, view.findViewById(16908294));
        this.f10261r.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f10261r.put(16908350, view.findViewById(16908350));
    }

    /* renamed from: c */
    public final View mo5812c(int i) {
        View view = (View) this.f10261r.get(i);
        if (view == null && (view = this.f9783a.findViewById(i)) != null) {
            this.f10261r.put(i, view);
        }
        return view;
    }
}
