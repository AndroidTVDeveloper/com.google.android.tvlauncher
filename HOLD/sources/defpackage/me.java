package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

@Deprecated
/* renamed from: me  reason: default package */
/* compiled from: PG */
public final class me extends km implements View.OnClickListener {
    public final Checkable p;
    public final TextView q;
    private final ViewGroup r;
    private final md s;

    public me(View view, md mdVar) {
        super(view);
        this.p = (Checkable) view.findViewById(R.id.button);
        this.r = (ViewGroup) view.findViewById(R.id.container);
        this.q = (TextView) view.findViewById(16908310);
        this.r.setOnClickListener(this);
        this.s = mdVar;
    }

    public final void onClick(View view) {
        this.s.a(this);
    }
}
