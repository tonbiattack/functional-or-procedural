fn main() {
    let numbers = vec![1, 2, 3, 4, 5];
    let sum: i32 = numbers.iter().sum();
    let average = sum as f64 / numbers.len() as f64;
    println!("Average: {}", average);
}
