package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: me */
/* compiled from: PG */
public final class C0331me extends C0285km implements View.OnClickListener {

    /* renamed from: p */
    public final Checkable f9951p;

    /* renamed from: q */
    public final TextView f9952q;

    /* renamed from: r */
    private final ViewGroup f9953r;

    /* renamed from: s */
    private final C0330md f9954s;

    public C0331me(View view, C0330md mdVar) {
        super(view);
        this.f9951p = (Checkable) view.findViewById(R.id.button);
        this.f9953r = (ViewGroup) view.findViewById(R.id.container);
        this.f9952q = (TextView) view.findViewById(16908310);
        this.f9953r.setOnClickListener(this);
        this.f9954s = mdVar;
    }

    public final void onClick(View view) {
        this.f9954s.mo5575a(this);
    }
}
