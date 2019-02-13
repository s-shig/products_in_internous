package jp.co.internous.action;

public class SmartPhone extends Mp3Player {
	@Override
	public void play() {
		System.out.println("再生（ハイレゾ機能）");
	}
	@Override
	public void stop() {
		System.out.println("停止（ハイレゾ機能）");
	}
	@Override
	public void next() {
		System.out.println("次へ（ハイレゾ機能）");
	}
	@Override
	public void back() {
		System.out.println("戻る（ハイレゾ機能）");
	}

	public void call() {
		System.out.println("電話");
	}
	public void mail() {
		System.out.println("メール");
	}
	public void photo() {
		System.out.println("写真");
	}
	public void internet() {
		System.out.println("インターネット");
	}
}
