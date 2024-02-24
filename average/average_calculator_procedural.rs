fn main() {
    let numbers = vec![1, 2, 3, 4, 5];
    let mut sum = 0;
    for number in &numbers {
        sum += number;
    }
    let average = sum as f64 / numbers.len() as f64;
    println!("Average: {}", average);
}
