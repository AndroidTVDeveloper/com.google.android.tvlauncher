package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.DialogPreference;

@Deprecated
/* renamed from: qq */
/* compiled from: PG */
public abstract class C0451qq extends DialogFragment implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private DialogPreference f10209a;

    /* renamed from: b */
    private CharSequence f10210b;

    /* renamed from: c */
    private CharSequence f10211c;

    /* renamed from: d */
    public int f10212d;

    /* renamed from: e */
    private CharSequence f10213e;

    /* renamed from: f */
    private CharSequence f10214f;

    /* renamed from: g */
    private int f10215g;

    /* renamed from: h */
    private BitmapDrawable f10216h;

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public void mo5774a(AlertDialog.Builder builder) {
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo5766a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5767a() {
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public final DialogPreference mo5785b() {
        if (this.f10209a == null) {
            this.f10209a = (DialogPreference) ((C0426ps) getTargetFragment()).mo5758a(getArguments().getString("key"));
        }
        return this.f10209a;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public void mo5765a(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f10214f;
            int i = 0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else if (findViewById instanceof TextView) {
                ((TextView) findViewById).setText(charSequence);
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    @Deprecated
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10212d = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C0426ps) {
            C0426ps psVar = (C0426ps) targetFragment;
            String string = getArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) psVar.mo5758a(string);
                this.f10209a = dialogPreference;
                this.f10210b = dialogPreference.f1315a;
                this.f10211c = dialogPreference.f1318d;
                this.f10213e = dialogPreference.f1319e;
                this.f10214f = dialogPreference.f1316b;
                this.f10215g = dialogPreference.f1320f;
                Drawable drawable = dialogPreference.f1317c;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    this.f10216h = (BitmapDrawable) drawable;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                this.f10216h = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.f10210b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f10211c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f10213e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f10214f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f10215g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f10216h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.f10212d = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f10210b).setIcon(this.f10216h).setPositiveButton(this.f10211c, this).setNegativeButton(this.f10213e, this);
        int i = this.f10215g;
        View view = null;
        if (i != 0) {
            view = LayoutInflater.from(activity).inflate(i, (ViewGroup) null);
        }
        if (view == null) {
            negativeButton.setMessage(this.f10214f);
        } else {
            mo5765a(view);
            negativeButton.setView(view);
        }
        mo5774a(negativeButton);
        AlertDialog create = negativeButton.create();
        if (mo5767a()) {
            create.getWindow().setSoftInputMode(5);
        }
        return create;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.f10212d == -1) {
            z = true;
        } else {
            z = false;
        }
        mo5766a(z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f10210b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f10211c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f10213e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f10214f);
        bundle.putInt("PreferenceDialogFragment.layout", this.f10215g);
        BitmapDrawable bitmapDrawable = this.f10216h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
