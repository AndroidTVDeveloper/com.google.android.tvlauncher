package p000;

import android.util.Pair;
import android.view.View;
import android.widget.CheckedTextView;
import com.google.android.exoplayer2.p003ui.TrackSelectionView;

/* renamed from: bhh */
/* compiled from: PG */
public final class bhh implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ TrackSelectionView f3971a;

    public /* synthetic */ bhh(TrackSelectionView trackSelectionView) {
        this.f3971a = trackSelectionView;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable, java.lang.Object] */
    public final void onClick(View view) {
        TrackSelectionView trackSelectionView = this.f3971a;
        ? r2 = 0;
        boolean z = true;
        if (view == trackSelectionView.f6237a) {
            trackSelectionView.f6240d = true;
            trackSelectionView.f6239c.clear();
        } else if (view != trackSelectionView.f6238b) {
            trackSelectionView.f6240d = false;
            Pair pair = (Pair) view.getTag();
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            bge bge = (bge) trackSelectionView.f6239c.get(intValue);
            bks.m3507a((Object) r2);
            if (bge == null) {
                if (trackSelectionView.f6239c.size() > 0) {
                    trackSelectionView.f6239c.clear();
                }
                trackSelectionView.f6239c.put(intValue, new bge(intValue, intValue2));
            } else if (!((CheckedTextView) view).isChecked()) {
                trackSelectionView.f6239c.put(intValue, new bge(intValue, intValue2));
            }
        } else {
            trackSelectionView.f6240d = false;
            trackSelectionView.f6239c.clear();
        }
        trackSelectionView.f6237a.setChecked(trackSelectionView.f6240d);
        CheckedTextView checkedTextView = trackSelectionView.f6238b;
        if (trackSelectionView.f6240d || trackSelectionView.f6239c.size() != 0) {
            z = false;
        }
        checkedTextView.setChecked(z);
        if (r2.length > 0) {
            bge bge2 = (bge) trackSelectionView.f6239c.get(0);
            throw r2;
        }
    }
}
