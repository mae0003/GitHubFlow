/**
 * 
 */
package jp.devmen.spellchecker.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author Hiroyuki
 *
 */
public class WordDictionary implements IWordDictionary {

	private static WordDictionary wordDictionary = new WordDictionary();

	/**
	 * シングルトンのためコンストラクタをプライベートにします。
	 */
	private WordDictionary() {
	}

	/**
	 * 単語帳クラスを取得します。
	 * 
	 * @return 単語帳クラス
	 */
	public static IWordDictionary getInstance() {
		return wordDictionary;
	}

	/**
	 * 単語が登録されているかどうかを返します。
	 * 
	 * @param word
	 *            検査対象の単語
	 * @return 単語が登録されている場合 true
	 */
	@Override
	public boolean containts(String word) {
		// 実装してください
		return false;
	}

	/**
	 * 単語を単語のリストに追加します。
	 * 
	 * @param word
	 *            追加する単語
	 */
	@Override
	public void addWord(String word) {
	}

	/**
	 * 辞書に登録されているすべての単語を取得します。
	 * 
	 * @return 単語のリスト
	 */
	@Override
	public List<String> getAllWord() {
		return Arrays.asList("Cat", "Dog", "Animal", "Fish", "Cow");
	}

}
